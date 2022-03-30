package com.bookdabang.lhs.persistence;

import java.util.List;

import com.bookdabang.common.domain.AttachFileVO;
import com.bookdabang.common.domain.Notice;

public interface NoticeDAO {
	public List<Notice> entireNotice();
	public Notice getContentByNo(int no);
	public int getNoticeNo();
	public int insertNotice(Notice n);
	public int insertAttachFile(AttachFileVO file, int no);
}
