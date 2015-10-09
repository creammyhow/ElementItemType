package com.example.stestsqlite;

//POJO ElementItemType
public enum ElementItemType {
	NOODLE_TYPE(3),
	NOODLE_INGREDIENT(2),
	SOMTAM(3),
	YAM_LARB(4),
	GRIELD_FFIED(5),
	DRINK(6),
	ORTHER(99);
	
	private final int val;
	private ElementItemType(int val) { this.val = val; }
	public int getVal() { return val; }
	
	public static ElementItemType getElementItemType(int value) {
	  for(ElementItemType e: ElementItemType.values()) {
	    if(e.val == value) {
	      return e;
	    }
	  }
	  return null;// not found
	}
	
}
