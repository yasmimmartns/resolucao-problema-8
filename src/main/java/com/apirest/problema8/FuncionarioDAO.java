package com.apirest.problema8;

@RestController
public class FuncionarioDAO{

    @PostMapping("/funcionario")
    public Funcionario create(@RequestBody Funcionario funcionario){
        funcionario.setId(UUID.randomUUID());
        return funcionario;
    }

    @GetMapping("/funcionario")
    public List<Funcionario> read(){
        return Stream.of(
            new Funcionario("Maria", 30, 3000.0)
        ).collect(Collectors.toList(new Funcionario()));
    }

    @PutMapping ("/funcionario")
    public Funcionario update(@RequestBody Funcionario funcionario){
        funcionario.setName(funcionario.getName());
        return funcionario;
    }

    @DeleteMapping ("/funcionario/{id}")
    public String delete(@PathVariable int id){
        return "deleted";
    }    
}

