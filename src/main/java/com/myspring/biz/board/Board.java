package com.myspring.biz.board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity // @Entity가 설정된 클래스를 엔티티라 하면, 기본적으로 클래스 이름과 동일한 테이블과 매핑
@Table(name = "BOARD") //엔티티 이름과 매핑될 테이블 이름이 다른 경우, name 속성을 사용하여 매핑한다.동일하면 생략가능
public class Board {

	@Id //테이블의 기본키를 매핑, 엔티티의 필수 어노테이션으로서 @Id가 없는 엔티티는 사용하지 못함
	@GeneratedValue // @Id가 선언된 필드에 기본 키 값을 자동으로 할당
	private int seq;
	private String title;
	private String writer;
	private String content;
	@Temporal(TemporalType.DATE)
	private Date regDate = new Date();
	private int cnt;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content" + content + ", regDate="
				+ regDate + ",cnt=" + cnt + "]";
	}

}
