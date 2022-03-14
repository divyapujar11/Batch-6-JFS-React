/**
 * 
 */
package com.cg.fms;

/**
 * @author dcpujar
 *
 */
public class Passenger {
	
	private String name;
	private boolean vip;
	/**
	 * Create Passenger constructor for retriving name and status vip of  customer
	 */
	public Passenger(String name, boolean vip) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.vip=vip;
	}
	public String getName() {
		return name;
	}
	public boolean isVip() {
		return vip;
	}
	
	

}
