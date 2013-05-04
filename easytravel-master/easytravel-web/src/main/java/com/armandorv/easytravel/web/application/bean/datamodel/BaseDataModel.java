package com.armandorv.easytravel.web.application.bean.datamodel;

import java.util.Collection;

import javax.faces.model.DataModel;
import javax.faces.model.DataModelEvent;
import javax.faces.model.DataModelListener;

abstract class BaseDataModel<E> extends DataModel<E> {

	public BaseDataModel() {
		this(null);
	}

	public BaseDataModel(Collection<E> data) {
		super();
		setWrappedData(data);
	}

	private int index = -1;

	private Collection<E> data;

	public boolean isRowAvailable() {
		if (data == null) {
			return (false);
		} else if ((index >= 0) && (index < data.size())) {
			return (true);
		} else {
			return (false);
		}
	}

	public int getRowCount() {

		if (data == null) {
			return (-1);
		}
		return (data.size());

	}

	public E getRowData() {
		if (data == null) {
			return (null);
		} else if (!isRowAvailable()) {
			throw new IllegalAccessError("No row available.");
		} else {
			return find(index);
		}
	}

	private E find(int index) {
		int i = 0;
		for (E element : data) {
			if(i == index){
				return element;
			}
			i++;
		}
		return null;
	}

	public int getRowIndex() {

		return (index);

	}

	public void setRowIndex(int rowIndex) {

		if (rowIndex < -1) {
			throw new IllegalArgumentException();
		}
		int old = index;
		index = rowIndex;
		if (data == null) {
			return;
		}
		DataModelListener[] listeners = getDataModelListeners();
		if ((old != index) && (listeners != null)) {
			Object rowData = null;
			if (isRowAvailable()) {
				rowData = getRowData();
			}
			DataModelEvent event = new DataModelEvent(this, index, rowData);
			int n = listeners.length;
			for (int i = 0; i < n; i++) {
				if (null != listeners[i]) {
					listeners[i].rowSelected(event);
				}
			}
		}

	}

	public Collection<E> getWrappedData() {
		return (this.data);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setWrappedData(Object data) {
		if (data == null) {
			this.data = null;
			setRowIndex(-1);
		} else {
			this.data = (Collection<E>) data;
			index = -1;
			setRowIndex(0);
		}
	}

}