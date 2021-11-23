===============================================
					PRODUTOS	
===============================================
==================	Delete  ===================
#cod:
	db.homework01.deleteOne({ 
		_id: ObjectId("619bfe00636eac2519a34abd")
	})

#request:
	{ 
		acknowledged: true, deletedCount: 1
	}

===================	 Find  ===================
#cod:
	db.homework01.find({
	    "tipoProduto": "COMIDA",
	    "valorUnitario": 1
	})

#request:
	{ 
		_id: ObjectId("619bfe00636eac2519a34abb"),
  		valorUnitario: 1,
  		descricao: 'Skol Beats',
  		tipoProduto: 'COMIDA' 
  	}
	{ 
		_id: ObjectId("619bfe00636eac2519a34abc"),
  		valorUnitario: 1,
  		descricao: 'Skol',
  		tipoProduto: 'COMIDA'
  	} 
==================	Find And ==================
#cod:
	db.homework01.find({ 
		tipoProduto: "COMIDA",
		descricao: /Sk/
	})

#request:
	{ 
		_id: ObjectId("619bfe00636eac2519a34abb"),
  		valorUnitario: 1,
  		descricao: 'Skol Beats',
  		tipoProduto: 'COMIDA' 
  	}
	{ 
		_id: ObjectId("619bfe00636eac2519a34abc"),
  		valorUnitario: 1,
  		descricao: 'Skol',
  		tipoProduto: 'COMIDA' 
  	}

==================	Find In  ==================
#cod:
	db.homework01.find({
 		descricao: { $in: [ "Skol" ] },
	})
 		tipoProduto: "COMIDA" 

#request:
	{
		_id: ObjectId("619bfe00636eac2519a34abc"),
  		valorUnitario: 1,
  		descricao: 'Skol',
  		tipoProduto: 'COMIDA' 
	}

===============================================
					CONTATO	
===============================================
==================	Delete  ===================
#cod:
	db.homework02.deleteOne({ 
		_id: ObjectId("619d4b0bf4bb57e0bdbb3fe1")
	})

#request:
	{ 
		acknowledged: true, deletedCount: 1
	}

===================	 Find  ===================
#cod:
	db.homework02.find({
	    "numero": "50002858",
	     descricao: 'CELULAR'
	})

#request:
	{ 
		_id: ObjectId("619d4b0bf4bb57e0bdbb3fe3"),
	    tipoContato: 'RESIDENCIAL',
		numero: '50002858',
		descricao: 'CELULAR',
		idContato: 7,
		idCliente: 5 
  	}
	 
==================	Find And ==================
#cod:
	db.homework02.find({ 
		tipoContato: 'RESIDENCIAL',
		descricao: /a/
	})

#request:
	{ 
		_id: ObjectId("619d4b0bf4bb57e0bdbb3fe5"),
		tipoContato: 'RESIDENCIAL',
		numero: '40002858',
		descricao: 'RESIDENCIAL',
		idContato: 9,
		idCliente: 7 
  	}
	{ 
		_id: ObjectId("619d4b0bf4bb57e0bdbb3fe4"),
		tipoContato: 'RESIDENCIAL',
		numero: '40002858',
		descricao: 'WHATS',
		idContato: 8,
		idCliente: 6 
  	}

==================	Find In  ==================
#cod:
	db.homework02.find({
 		descricao: { $in: [ "WHATS", "string" ] },
	})
 		

#request:
	{
		_id: ObjectId("619d4b0bf4bb57e0bdbb3fe1"),
		tipoContato: 'COMERCIAL',
		numero: '900654839',
		descricao: 'WHATS',
		idContato: 4,
		idCliente: 2 
	}
	{
		_id: ObjectId("619d4b0bf4bb57e0bdbb3fe1"),
		tipoContato: 'COMERCIAL',
		numero: '900654839',
		descricao: 'WHATS',
		idContato: 4,
		idCliente: 2 
	}
	{
		_id: ObjectId("619d4b0bf4bb57e0bdbb3fe6"),
		tipoContato: 'COMERCIAL',
		numero: 'string',
		descricao: 'string',
		idContato: 12,
		idCliente: 2 
	}