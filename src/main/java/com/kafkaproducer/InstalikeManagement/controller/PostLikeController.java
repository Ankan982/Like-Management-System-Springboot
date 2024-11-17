package com.kafkaproducer.InstalikeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaproducer.InstalikeManagement.model.CreateOrUpdateLikeRequest;
import com.kafkaproducer.InstalikeManagement.model.LikeEntity;
import com.kafkaproducer.InstalikeManagement.process.PostLikeProcess;

@RestController
@RequestMapping("/api/posts")
public class PostLikeController {
	
	@Autowired
	private PostLikeProcess postLikeProcess;
	
	@GetMapping("/getLikesCount/{postId}")
	public String getLikeCount( @PathVariable("postId") String postId)
	{
		//System.out.println("Inside the method of getLikeCount of PostLikeController with input: "+postId);
		return "like count :"+postId;
	}
	
	

	@GetMapping("/getPost/{postId}")
	public LikeEntity getPostLikeDetails( @PathVariable("postId") String postId)
	{
		//System.out.println("Inside the method of getPostLikeDetails of PostLikeController with input: "+postId);
		LikeEntity getPostData=  postLikeProcess.getPostDetails(postId);
		return getPostData;
	}
	
	
	
	
	@PostMapping("/savePostLike")
	public String createOrUpdateLike(@RequestBody  CreateOrUpdateLikeRequest createOrUpdateLikeRequest )
	{
		String isPostUpdateOrCreatedReturn= null;
		if(null!=createOrUpdateLikeRequest)
		{
			isPostUpdateOrCreatedReturn =	postLikeProcess.createOrUpdatePostLike(createOrUpdateLikeRequest);	
		}
		if(!isPostUpdateOrCreatedReturn.isEmpty())
		{
			return isPostUpdateOrCreatedReturn;
		}
		else {
			return "Error";
		}
	}

}
