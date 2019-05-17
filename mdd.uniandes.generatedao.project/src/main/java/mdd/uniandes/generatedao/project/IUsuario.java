/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdd.uniandes.generatedao.project;

import mdd.uniandes.generatedao.annotations.TableColumn;
import mdd.uniandes.generatedao.annotations.TableSerializable;

/**
 *
 * @author kedavidsa
 */
@TableSerializable(name = "Usuario")
public interface IUsuario {
    @TableColumn String getNombre();
    @TableColumn String getApellido();
    @TableColumn String getUsername();  
}
