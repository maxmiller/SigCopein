json.array!(@alunos) do |aluno|
  json.extract! aluno, :id, :matricula, :nome, :email, :habilitado, :cpf, :lattes
  json.url aluno_url(aluno, format: :json)
end
