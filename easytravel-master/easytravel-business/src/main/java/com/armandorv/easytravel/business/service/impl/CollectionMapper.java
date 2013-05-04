package com.armandorv.easytravel.business.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import com.armandorv.easytravel.business.service.Mapper;

class CollectionMapper<S, R> implements
		Mapper<Collection<S>, Collection<R>> {

	private Mapper<S, R> mapper;

	private Collection<R> result = new ArrayList<>();

	public CollectionMapper(Mapper<S, R> mapper) {
		this.mapper = mapper;
	}

	public CollectionMapper(Mapper<S, R> mapper, Collection<R> result) {
		this.mapper = mapper;
		this.result = result;
	}

	@Override
	public Collection<R> map(Collection<S> source) {

		for (S s : source) {
			result.add(mapper.map(s));
		}

		return result;
	}

}