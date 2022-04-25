package com.bookdabang.kmj.service;

import java.util.List;
import java.util.Map;

import com.bookdabang.common.domain.ReviewVO;
import com.bookdabang.kmj.etc.UploadFile;
import com.bookdabang.common.domain.RecommendVO;
import com.bookdabang.common.domain.ReviewComment;

public interface ReviewService {
	// n번 상품의 리뷰들 가져오기 (첨부파일까지 포함,페이징 포함)
	public Map<String, Object> readAllReview (int prodNo,int pageNo) throws Exception;
	
	// n번 리뷰의 댓글들 가져오기
	public List<ReviewComment> readAllComments (int rno) throws Exception;
	
	// n번 리뷰의 댓글 추가
	public boolean addComment (ReviewComment comment) throws Exception;
	
	// 리뷰 추천한 유저인지 확인하기
	public List<Integer> confirmRecommend(String userId) throws Exception;
	
	// n번 리뷰의 추천수 증가/감소
	public boolean changeRecommend(RecommendVO recommend) throws Exception;
	
	// 리뷰 추가하기
	public boolean addReview(ReviewVO review, List<UploadFile> upfileList) throws Exception;
	
	// 리뷰 수정하기
	public boolean modifyReview(ReviewVO review, List<UploadFile> upfileList) throws Exception;
	
	// 리뷰 삭제하기
	public boolean deleteReview(int reviewNo) throws Exception;
	
	// n번 댓글 수정하기
	public boolean modifyComment(ReviewComment comment) throws Exception;
	
	// n번 댓글 삭제하기
	public boolean deleteComment(ReviewComment comment) throws Exception;
	
	// 리뷰 수정시, 기존 첨부파일 삭제하는 메서드
	public boolean deleteAttachFile(List<Integer> attachNoList) throws Exception;
}
