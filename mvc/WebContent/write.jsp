<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 추가</title>
</head>
<body>
	<form action="write-ok.product" method="post">
		<label>
			<input type="text" name="productName" placeholder="상품명">
		</label>
		<label>
			<input type="text" name="productPrice" placeholder="상품가격">
		</label>
		<label>
			<input type="text" name="productStock" placeholder="상품재고">
		</label>
		<button>완료</button>
	</form>
</body>
</html>



