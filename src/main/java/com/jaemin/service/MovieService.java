package com.jaemin.service;

import java.util.List;
import com.jaemin.vo.MovieVO;

public interface MovieService {
	public List<MovieVO> selectMovie() throws Exception;
}
