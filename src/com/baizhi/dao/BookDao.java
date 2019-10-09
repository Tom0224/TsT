package com.baizhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.BookEntity;
import com.baizhi.entity.CategoryEntity;

public interface BookDao{
	//��ѯȫ��
	public List<BookEntity> selectbookall();
	//ͨ��id ��ѯ
		public BookEntity selectbookid(Integer book_id);
	
	//��ѯ	��������  �Ƽ���
	public List<BookEntity> selectsalenumdes();
	//��ѯ	������ǰ8��  ������
	public List<BookEntity> selectsalenum();
	//��ѯ     ʱ������ 	���¿�  
	public List<BookEntity> selectdate();
	//��ѯ     ʱ������ ��������	���¿�  
	public List<BookEntity> selectdatedes();
	//��ѯ	�������  ������
	public List<BookEntity> selectbooksalenum();
	//ͨ��id���һ��ѯ
	public BookEntity selectBookEntityId(Integer id);
	
	
	//��ҳ��ѯһ����
	public  List<BookEntity> selectpaging(@Param("page")Integer page,@Param("over")Integer over,@Param("id")Integer id);
	//��ѯ������
	public Integer selectsum(Integer parent_id);
	
	//������
	public List<BookEntity> selectByStartEndAndScid(@Param("s")Integer start,@Param("e")Integer end,@Param("cid")Integer cid);
	


	
	/**
	 * ���ݶ�������Ų�ѯ����������ж��ٱ���
	 * @param scid ���������
	 * @return ͼ�������
	 */
	public Integer selectCountByScid(Integer cid);

}
