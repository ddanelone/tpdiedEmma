package com.tpdied.mappers;

import com.tpdied.dto.RutaDTO;
import com.tpdied.models.Ruta;

public class RutaMapper {
    public static Ruta toEntity(RutaDTO rutaDTO){

        Ruta ruta = new Ruta();
        ruta.setId(rutaDTO.getId());
        ruta.setSucursalOrigen(SucursalMapper.toEntity(rutaDTO.getSucursalOrigen()));
        ruta.setSucursalDestino(SucursalMapper.toEntity(rutaDTO.getSucursalDestino()));
        ruta.setCapacidadEnKilos(rutaDTO.getCapacidadEnKilos());
        ruta.setDuracionViaje(rutaDTO.getDuracionViaje());
        ruta.setEstado(rutaDTO.getEstado());

        return ruta;
    }

    public static RutaDTO toDto(Ruta ruta){
        RutaDTO rutaDTO = new RutaDTO();
        rutaDTO.setId(ruta.getId());
        rutaDTO.setSucursalOrigen(SucursalMapper.toDto(ruta.getSucursalOrigen()));
        rutaDTO.setSucursalDestino(SucursalMapper.toDto(ruta.getSucursalDestino()));
        rutaDTO.setCapacidadEnKilos(ruta.getCapacidadEnKilos());
        rutaDTO.setDuracionViaje(ruta.getDuracionViaje());
        rutaDTO.setEstado(ruta.getEstado());

        return rutaDTO;
    }
}
