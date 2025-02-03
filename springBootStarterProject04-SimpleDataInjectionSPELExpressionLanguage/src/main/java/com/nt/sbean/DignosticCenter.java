package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dc")
public class DignosticCenter {

	
	@Value("${dc.id}")
	private Integer dcid;
	
	
	@Value("${dc.name}")
	private String dcname;
	
	
	
	@Value("${dc.location}")
	private String dcloacation;
	
	@Value("${dc.pincode}")
	private Integer dcpincode;
	
	@Autowired
	private TestRateCard card;
	
	@Value("#{tinfo.xrayRate+tinfo.TwoDecoRate+tinfo.ThreeDecoRate+tinfo.mRIRate}") //SPEL
	private float BillAmount;
	
	
	@Value("${os.name}")
	private String osname;
	
	@Value("${Path}")
	private String path;
	
	@Value("#{tinfo.xrayRate>=1000}")
	private boolean isXrayRateOverPriced;
	
	//toString
	@Override
	public String toString() {
		return "DignosticCenter [dcid=" + dcid + ", dcname=" + dcname + ", dcloacation=" + dcloacation + ", dcpincode="
				+ dcpincode + ", card=" + card + ", BillAmount=" + BillAmount + ", osname=" + osname + ", path=" + path
				+ ", isXrayRateOverPriced=" + isXrayRateOverPriced + "]";
	}	
	
}
