class CreateDespachos < ActiveRecord::Migration
  def change
    create_table :despachos do |t|
      t.date :data_inicio
      t.date :data_fim
      t.string :evento
      t.string :local
      t.string :passagem_aerea
      t.string :processo
      t.string :hora_inicio
      t.string :hora_fim
      t.references :servidor, index: true

      t.timestamps
    end
  end
end
