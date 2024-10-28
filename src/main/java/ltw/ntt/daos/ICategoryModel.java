package ltw.ntt.daos;

import java.util.List;

import ltw.ntt.models.CategoryModel;

public interface ICategoryModel {
	List<CategoryModel> findAll();
	CategoryModel findById(int categoryid);
	void insert(CategoryModel category);
	void update(CategoryModel category);
	void delete(int categoryid);
	List<CategoryModel> findByName(String keyword);
}
