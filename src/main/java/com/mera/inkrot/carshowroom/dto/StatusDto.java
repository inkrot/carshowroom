package com.mera.inkrot.carshowroom.dto;

import com.mera.inkrot.carshowroom.model.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;

@ApiModel(description = "Class for transferring data of Status entity.")
@XmlRootElement(name="status")
@XmlAccessorType(XmlAccessType.FIELD)
public class StatusDto extends Dto implements Serializable {

    @ApiModelProperty(notes = "Code of the Status.", example = "BEING_PROCESSED")
    @XmlElement
    private String code;

    @ApiModelProperty(notes = "Name of the Status.", example = "выполнен")
    @XmlElement
    private String name;

    public StatusDto() { }

    public StatusDto(Long id) {
        setId(id);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static StatusDto getFromEntity(Status status) {
        if (status == null) return null;
        StatusDto statusDto = new StatusDto();
        statusDto.setId(status.getId());
        statusDto.setCode(status.getCode());
        statusDto.setName(status.getName());
        return statusDto;
    }

    @Override
    public String toString() {
        return "StatusDto{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusDto statusDto = (StatusDto) o;
        return Objects.equals(code, statusDto.code) &&
                Objects.equals(name, statusDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }
}
