# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended that you check this file into your version control system.

ActiveRecord::Schema.define(version: 20140903122544) do

  create_table "alunos", force: true do |t|
    t.string   "matricula"
    t.string   "nome"
    t.string   "email"
    t.boolean  "habilitado"
    t.string   "cpf"
    t.string   "lattes"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "despachos", force: true do |t|
    t.date     "data_inicio"
    t.date     "data_fim"
    t.string   "evento"
    t.string   "local"
    t.string   "passagem_aerea"
    t.string   "processo"
    t.string   "hora_inicio"
    t.string   "hora_fim"
    t.integer  "servidor_id"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  add_index "despachos", ["servidor_id"], name: "index_despachos_on_servidor_id", using: :btree

  create_table "editals", force: true do |t|
    t.string   "descricao"
    t.boolean  "habilitado"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "servidors", force: true do |t|
    t.string   "siape"
    t.string   "nome"
    t.string   "email"
    t.boolean  "habilitado"
    t.string   "cpf"
    t.string   "lattes"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

end
