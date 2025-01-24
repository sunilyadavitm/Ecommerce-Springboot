package com.sl.Sunil.Eccormerce.service.interf;

import com.sl.Sunil.Eccormerce.dto.CategoryDto;
import com.sl.Sunil.Eccormerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
