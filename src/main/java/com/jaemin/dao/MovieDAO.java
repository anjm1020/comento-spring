package com.jaemin.dao;

import java.util.List;
import com.jaemin.vo.MovieVO;

public interface MovieDAO {
	public List<MovieVO> selectMovie() throws Exception;
}
