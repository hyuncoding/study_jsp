package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.ProductDAO;
import com.app.vo.ProductVO;

public class Write extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		ProductVO productVO = new ProductVO();
		ProductDAO productDAO = new ProductDAO();

		String productName = req.getParameter("productName");
		System.out.println(productName);
		
		productVO.setProductName(req.getParameter("productName"));
		productVO.setProductPrice(Integer.parseInt(req.getParameter("productPrice")));
		productVO.setProductStock(Integer.parseInt(req.getParameter("productStock")));
		
		productDAO.insert(productVO);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}













