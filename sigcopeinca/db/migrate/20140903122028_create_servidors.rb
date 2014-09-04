class CreateServidors < ActiveRecord::Migration
  def change
    create_table :servidors do |t|
      t.string :siape
      t.string :nome
      t.string :email
      t.boolean :habilitado
      t.string :cpf
      t.string :lattes

      t.timestamps
    end
  end
end
