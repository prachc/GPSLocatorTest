package com.prach.mashup.gpstest;

public final class AuxMath extends Float11{
	public static long round (double value){
		return (long)(value + 0.5);  
	}

	public static double floor (double coordinate){
		return (double)((int)coordinate);
	}
}