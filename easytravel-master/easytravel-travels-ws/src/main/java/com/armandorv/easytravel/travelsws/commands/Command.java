package com.armandorv.easytravel.travelsws.commands;

public interface Command<T, R> {

	R execute(T param);
}
