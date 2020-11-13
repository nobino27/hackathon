package com.sample.demo.mapper

import com.sample.demo.dto.TeacherDTO
import com.sample.demo.model.Teacher
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface MapToDTO {
    @Mapping(source = "id", target = "id")
    fun toDTO(teacher: Teacher): TeacherDTO
}