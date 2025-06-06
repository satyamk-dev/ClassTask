package com.nt.controller;

import java.util.List;

import com.nt.DAO.Hospital;

public interface IController {

	public List<Hospital> HPController(String Hospital_Name)throws Exception;
}
