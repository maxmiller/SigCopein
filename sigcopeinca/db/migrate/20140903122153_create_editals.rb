class CreateEditals < ActiveRecord::Migration
  def change
    create_table :editals do |t|
      t.string :descricao
      t.boolean :habilitado

      t.timestamps
    end
  end
end
