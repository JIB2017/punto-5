@RequestMapping(path = "/registrousuario/{op},{n1},{n2}", method = RequestMethod.GET)
	public ModelAndView registroUsuario(@PathVariable String op, @PathVariable Float n1, @PathVariable Float n2) {

		ModelMap modelo2 = new ModelMap();
		
		Float resultado;
		modelo2.addAttribute("op", op);
		modelo2.addAttribute("n1", n1);
		modelo2.addAttribute("n2", n2);
		
//		modelo2.put("clave1", op);
//		modelo2.put("clave1", n1);
//		modelo2.put("clave1", n2);
		
		switch(op){
		
			case "sumar":
				resultado = n1 + n2;
				break;
			
			case "restar":
				resultado = n1 - n2;
				break;
			
			case "dividir":
				resultado = n1 / n2;
				break;
			
			case "multiplicar":
				resultado = n1 * n2;
				break;
			
			default :
				return new ModelAndView("errorOperacion");
		}
		
		modelo2.addAttribute("resultado", resultado);
		return new ModelAndView("operacion",modelo2);
	}
	
