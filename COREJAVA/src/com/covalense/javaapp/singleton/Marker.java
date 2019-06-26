package com.covalense.javaapp.singleton;

public class Marker {
	private static final Marker m = new Marker();

	private Marker() {
		System.out.println("marker");

	}

	public static Marker getMarker() {
		return m;
	}
}
