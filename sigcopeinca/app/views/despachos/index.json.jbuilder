json.array!(@despachos) do |despacho|
  json.extract! despacho, :id, :data_inicio, :data_fim, :evento, :local, :passagem_aerea, :processo, :hora_inicio, :hora_fim, :servidor_id
  json.url despacho_url(despacho, format: :json)
end
