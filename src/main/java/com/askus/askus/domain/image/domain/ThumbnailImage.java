package com.askus.askus.domain.image.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.askus.askus.domain.board.domain.Board;
import com.askus.askus.domain.common.BaseEntity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * ThumbnailImage entity
 *
 * @Mapping - mapped with Board
 * @Function - create
 * @AggregateRoot - Board
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "thumbnail_image")
@Entity
public class ThumbnailImage extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false)
	private Long id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_id")
	private Board board;
	@Column
	private String url;

	public ThumbnailImage(Board board, String url) {
		this.board = board;
		this.url = url;
	}
}
