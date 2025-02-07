package com.nt.comp;

public final class BlueDart implements Courier {

	@Override
	public String deliver(int iod) {
		
		return iod +" order kept for delivery by BlueDart";
	}

}
