package com.set.img.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.set.img.entity.ImgModel;

@Repository
public interface IImgModelRepository extends JpaRepository<ImgModel, Integer>{

}
