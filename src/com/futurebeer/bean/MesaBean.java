package com.futurebeer.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.futurebeer.dao.FactoryDao;
import com.futurebeer.dto.MesaDTO;
import com.futurebeer.exception.BaseException;

@ManagedBean(name="mesaBean")
@SessionScoped
public class MesaBean implements Serializable{
	private static final long serialVersionUID = 6787583383231299067L;

	private MesaDTO selectedMesa;
	
	private int count;
	
	private List<MesaDTO> mesas;
	
	public MesaBean() {
		//chama a DAO
		System.out.println("construtor");
		// Begin unit of work
		try {
			mesas = FactoryDao.getInstance().getMesaDao().getMesas();
		} catch (BaseException e) {
			e.printStackTrace();
		}
	}
	
	public List<MesaDTO> getMesas() {
		System.out.println("getMesas : " + count++);
		
		return mesas;
	}

	public MesaDTO getSelectedMesa() {
		return selectedMesa;
	}

	public void setSelectedMesa(MesaDTO selectedMesa) {
		this.selectedMesa = selectedMesa;
	}

}