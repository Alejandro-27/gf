package com.Factory.Factory.servicios;

import Entidades.Empresa;
import com.Factory.Factory.repo.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class EmpresaServicios {
    @Autowired
    EmpresaRepository empresaRepository;

    //Metodo para traerme una lista todas las empresas usando metodos de jpaRepository
    public List<Empresa> getAllEmpresas() {
        ArrayList listaEmpresas = new ArrayList <>();
        empresaRepository.findAll().forEach(empresa -> listaEmpresas(empresa));

        return listaEmpresas;
    }

    //Metodo para devolverme un objeto tipo empresa por id
    public Empresa getEmpresaById(Integer id){
        return empresaRepository.findById(id).get();
    }

    //Metodo para guardar o actualizar
    public boolean guardarOActualizarEmpresa(Empresa empresa){
        Empresa empr = empresaRepository.save(empresa);
        if(empresaRepository.findById(empr.getId() != null)){
            return true;
        }
        return false;
    }
}

