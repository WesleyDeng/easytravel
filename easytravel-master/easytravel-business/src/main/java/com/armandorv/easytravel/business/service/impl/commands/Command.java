package com.armandorv.easytravel.business.service.impl.commands;

public interface Command<T, R> {

	R execute(T param);
}
