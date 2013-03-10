package com.armandorv.easytravel.web.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class GalleryBean {

	private List<String> images = new ArrayList<>();

	@PostConstruct
	public void init() {

		for (int i = 1; i <= 12; i++) {
			images.add("galleria" + i + ".jpg");
		}
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

}
