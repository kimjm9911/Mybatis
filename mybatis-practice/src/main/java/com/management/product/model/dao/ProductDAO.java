package com.management.product.model.dao;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import java.util.List;
import java.util.Map;

public interface ProductDAO {
    @Results(id="productResultMap", value={
            @Result(id=true, property = "productCode", column = "product_code"),
            @Result(property = "productName", column = "product_name"),
            @Result(property = "originCost", column = "origin_cost"),
            @Result(property = "releaseDate", column = "release_date"),
            @Result(property = "discountRate", column = "discount_rate"),
            @Result(property = "salesQuantity", column = "sales_quantity"),
            @Result(property = "stockQuantity", column = "stock_quantity"),
            @Result(property = "categoryCode", column = "category_code"),
            @Result(property = "productionStatus", column = "production_status"),
    })

    // * 주석을 지우고 Mapper interface(= DAO class) 역할을 하도록 내용을 작성하세요.
    List<ProductDTO> selectAllProductList();


    List<ProductDTO> selectProductBySearchCondition(SearchCondition searchCondition);

    int insertProduct(ProductDTO product);

    int updateProduct(ProductDTO product);

    int deleteProduct(Map<String, String> parameter);
}