package com.baizhi.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.BookEntity;

public interface BookService {
	//��ѯȫ��
		public List<BookEntity> selectbookall();
		public BookEntity selectbookid(Integer book_id);
		
		
		//��ѯ	��������  �Ƽ���
		public List<BookEntity> selectsalenumdes();
		//��ѯ	������ǰ8��  ������
		public List<BookEntity> selectsalenum();
		//��ѯ     ʱ������ 	���¿�  
		public List<BookEntity> selectdate();
		
		public List<BookEntity> selectbooksalenum();
		//ͨ��id���һ��ѯ
		public BookEntity selectBookEntityId(Integer id);
		
		
		//��ҳ��ѯ
		public  List<BookEntity> selectpaging(Integer pa,Integer ov,Integer id);
		//��ѯ������
		public Integer selectsum(Integer over,Integer parent_id);
			
		//������
		public List<BookEntity> selectByStartEndAndScid(Integer start,Integer end,Integer cid);
		/**
		 * ���ݶ�������Ų�ѯ����������ж��ٱ���
		 * @param scid ���������
		 * @return ͼ�������
		 */
		public Integer selectCountByScid(Integer end,Integer cid);
		
	
		//û��ʵ��
		//��ѯ     ʱ������ ��������	���¿�  
		public List<BookEntity> selectdatedes();

}
