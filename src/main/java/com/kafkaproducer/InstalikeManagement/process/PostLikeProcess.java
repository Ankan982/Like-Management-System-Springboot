package com.kafkaproducer.InstalikeManagement.process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kafkaproducer.InstalikeManagement.model.CreateOrUpdateLikeRequest;
import com.kafkaproducer.InstalikeManagement.model.LikeEntity;
import com.kafkaproducer.InstalikeManagement.repository.LikeRepository;

@Component
public class PostLikeProcess {
	
	@Autowired
	private LikeRepository tLikeRepository;

	public String createOrUpdatePostLike(CreateOrUpdateLikeRequest createOrUpdateLikeRequest)
	{
		Boolean isCreateOrUpdate = Boolean.FALSE;

		//System.out.println("Inside the method of createOrUpdatePostLike of PostLikeProcess with input: "+createOrUpdateLikeRequest);
		
		if(null!=createOrUpdateLikeRequest.getCreateOrUpdateFlag() && 
				createOrUpdateLikeRequest.getCreateOrUpdateFlag().equalsIgnoreCase("C"))
		{
			try {
				 
				LikeEntity createPostLike = new LikeEntity();
				createPostLike.setPost_id( Long.valueOf(createOrUpdateLikeRequest.getPost_id()));
				createPostLike.setLike_count( Long.valueOf(createOrUpdateLikeRequest.getLike_count()));

				tLikeRepository.saveAndFlush(createPostLike);
				isCreateOrUpdate=Boolean.TRUE;
			}
			catch(Exception ex)
			{
				isCreateOrUpdate=Boolean.FALSE;
			}

		}

		if(isCreateOrUpdate)
		{
			return "Post Like is create / updated successfully";
		}
		else {
			return "Something went wrong";
		}


	}
	
	public LikeEntity getPostDetails(String postId)
	{
		LikeEntity getLikeEntity = new LikeEntity();
		getLikeEntity =  tLikeRepository.findByPostId(Long.valueOf(postId));
		
		return getLikeEntity;
	}
	
	
	
}
