package com.sree.sree.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sree.sree.entities.load;
@Service
public class loadserviceimpl implements loadservice {

	List<load> list;
	public loadserviceimpl() {
		list=new ArrayList<>();
		list.add(new load("alwar","jaipur","chemicals","canter",1,100,"com", "12-13-2002",100,123));
	}
	@Override
	public List<load> getload() {
		
		return list;
	}
//
//	@Override
//	public load addload(long loadid) {
//		return null;
//	}
	@Override
	public load getloads(long loadid) {
		load c=null;
		for(load Load:list) {
			if(Load.getLoadid()==loadid) {
				c=Load;
				break;
			}
				
		}
		return c;
	}
	@Override
	public load addload(load Load) {
		list.add(Load);
		return Load;
	}
//	public load updateload(load Load) {
//		list.update(Load);
//		return Load;
//	}
//	@Override
//	public load updateload(load Load) {
//		list.update(Load);
//		return Load;
//	}

}
