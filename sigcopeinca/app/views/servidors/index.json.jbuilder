json.array!(@servidors) do |servidor|
  json.extract! servidor, :id, :siape, :nome, :email, :habilitado, :cpf, :lattes
  json.url servidor_url(servidor, format: :json)
end
