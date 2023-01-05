package com.set.img.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImgModel {
	
	@Id
	private Integer id;
	private String name;
	private String gender;
	private String address;
	@Lob
	private byte[] img; 

}