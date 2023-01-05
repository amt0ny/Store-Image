package com.set.img.serviceimpl;

import java.io.FileInputStream;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.set.img.entity.ImgModel;
import com.set.img.repository.IImgModelRepository;
import com.set.img.service.IImgService;

@Service
public class ImgServiceImpl implements IImgService {

	@Autowired
	private IImgModelRepository imgRepo;

	@Override
	public String insertData() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Pritam Saini\\Desktop\\Images\\download (1).png");
		
		byte[] data = new byte[file.available()];
		System.out.println(data);
		file.read(data);
		System.out.println(data);
		ImgModel imgModel = new ImgModel();
		imgModel.setId(5);
		imgModel.setAddress("Kolkata WB");
		imgModel.setGender("M");
		imgModel.setName("Ramam");
		imgModel.setImg(data);
		imgRepo.save(imgModel);
		return "Data added successfully";
	}

	
	
	// [B@23605428
	
	
	@Override
	public String getImage() {

//		byte[] firstImage = imgRepo.getById(1).getImg();
//		byte[] secondImage = imgRepo.getById(2).getImg();
		
		System.out.println(imgRepo.getById(1).getImg().equals(imgRepo.getById(2).getImg()));
//		System.out.println(secondImage);
//		if (firstImage == secondImage) {
//			return "Both contains equal byte code";
//		}
		return "Both Images contains different value";
	}

}
