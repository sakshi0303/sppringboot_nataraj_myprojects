package com.nt.service;

import java.util.List;

public interface ICompanyServiceMgmt {
	public String savedatausingparent();
	public String savedatausingchild();
	public void loadallParentAnditsAssociatedChildObjsOnetoManyDefaultfetchTypeLAZY();
	public void loadrecordsfromChildManyToOneDefaultfetctypeEAGER();
	public String deleteparentanditsAssociatedChild(Integer pid);
	public String deletefromChildrecordthathassiblingrecord(Integer pid);
	public String addingAnotherChildtoParent(Integer parentid);
	public List<Object[]> getHQLinnerjoinFromCustomParentRepo();
	public List<Object[]> showParent2ChildJoinsData();
	public List<Object[]> showChild2ParentJoinsData();
}
	

