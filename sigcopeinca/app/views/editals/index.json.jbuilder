json.array!(@editals) do |edital|
  json.extract! edital, :id, :descricao, :habilitado
  json.url edital_url(edital, format: :json)
end
