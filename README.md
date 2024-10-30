O projeto visa ter um recurso com a mesma classe tanto no POST quanto no PUT, sendo que no POST o atributo statusTarefa não é obrigatório e no PUT ele é. 
Para isso foi criada uma validação customizada já que um @NotBlank iria exigir o preenchimento nos dois cenários.
