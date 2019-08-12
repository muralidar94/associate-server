package com.example.associate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/associateApi")
public class AssociateController {
    
	
	@Autowired
	private AssociateRepo associateRepo;
	
     @RequestMapping(value="/save",method=RequestMethod.POST)
     public void saveAssociate(@RequestBody Associate a) {
    	 associateRepo.save(a);
     }
     
     /*@PostMapping("saveAll")
     public void saveAllAssociate(List<AssociateDto> aa) {
    	 associateService.saveAssociate(aa);
     }   
*/  
     @RequestMapping(value="/update",method=RequestMethod.PUT)
     public void updateAssociate(@RequestBody Associate a) {
    	 associateRepo.save(a);
     }
     
     @RequestMapping(value="/getAll",method=RequestMethod.GET)
 	 public List<Associate> getAll(){
 		return associateRepo.findAll();
 		
 	}
     
     @RequestMapping(value="/get/{id}",method=RequestMethod.GET)
  	public Optional<Associate> getAssociate(@PathVariable Long id){
    	 Optional<Associate> asso=associateRepo.findById(id);
    	 if(asso.isPresent())
    	 return asso;
    	 return null;
  	}
     
     @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
     public void deleteAssociate(Long id) {
    	 associateRepo.deleteById(id);
 	}
     
}
