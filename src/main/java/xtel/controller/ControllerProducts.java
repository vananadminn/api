package xtel.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xtel.entities.BaseResponse;
import xtel.entities.Products;
import xtel.entities.ReadAllProduct;
import xtel.services.ProductsServices;

@Controller
@RequestMapping("/api")
public class ControllerProducts {

	@Autowired
	ProductsServices tools;

	@GetMapping("/getall")
	@ResponseBody
	public ReadAllProduct getListAll() {
		List<Products> list = tools.getAllProducts();
		int count = list.size();
		ReadAllProduct data = new ReadAllProduct("Success query: " + count + " product", 0, list);
		return data;
	}

	@PutMapping("/update/{id}")
	@ResponseBody
	public ReadAllProduct update(@PathVariable("id") Integer id, @RequestBody Products pro) {
		ReadAllProduct rap = null;
		BaseResponse base = null;
		List<Products> list = tools.getAllProducts();
		for (int i = 0; i < list.size(); i++) {
			int idProduct = list.get(i).getId();
			if (idProduct != id) {
				break;
			} else {
				Products p = new Products();
				List<Products> listItem = new ArrayList<Products>();
				p.setId(id);
				p.setProductcode(pro.getProductcode());
				p.setProductname(pro.getProductname());
				p.setQuantity(pro.getQuantity());
				p.setUnit(pro.getUnit());
				p.setUnsettledDiv(pro.getUnsettledDiv());
				listItem.add(p);
				tools.updateProduct(id, p);
				return rap = new ReadAllProduct("Update id: " + id + " success", 0, list);
			}
		}
		return null;
	}

	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public BaseResponse delete(@PathVariable("id") int id) {
		tools.deleteProduct(id);
		BaseResponse data = new BaseResponse();
		data.Result("Success delete id: " + id, 0);
		return data;
	}

	@PostMapping("/post")
	@ResponseBody
	public ReadAllProduct post(@RequestBody Products pro) {
		ArrayList<Products> list = new ArrayList<Products>();
		Products p = new Products();
		p.setProductcode(pro.getProductcode());
		p.setProductname(pro.getProductname());
		p.setQuantity(pro.getQuantity());
		p.setUnit(pro.getUnit());
		p.setUnsettledDiv(pro.getUnsettledDiv());
		list.add(p);
		tools.addProduct(p);
		ReadAllProduct rap = new ReadAllProduct("Post success", 0, list);
		return rap;
	}

}
