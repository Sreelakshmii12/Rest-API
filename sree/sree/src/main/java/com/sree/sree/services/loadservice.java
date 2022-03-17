package com.sree.sree.services;

import java.util.List;

import com.sree.sree.entities.load;

public interface loadservice {
public List<load> getload();
public load getloads(long loadid);
public load addload(load Load);
//public load updateload(load Load);
}
