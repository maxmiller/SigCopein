require 'test_helper'

class DespachosControllerTest < ActionController::TestCase
  setup do
    @despacho = despachos(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:despachos)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create despacho" do
    assert_difference('Despacho.count') do
      post :create, despacho: { data_fim: @despacho.data_fim, data_inicio: @despacho.data_inicio, evento: @despacho.evento, hora_fim: @despacho.hora_fim, hora_inicio: @despacho.hora_inicio, local: @despacho.local, passagem_aerea: @despacho.passagem_aerea, processo: @despacho.processo, servidor_id: @despacho.servidor_id }
    end

    assert_redirected_to despacho_path(assigns(:despacho))
  end

  test "should show despacho" do
    get :show, id: @despacho
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @despacho
    assert_response :success
  end

  test "should update despacho" do
    patch :update, id: @despacho, despacho: { data_fim: @despacho.data_fim, data_inicio: @despacho.data_inicio, evento: @despacho.evento, hora_fim: @despacho.hora_fim, hora_inicio: @despacho.hora_inicio, local: @despacho.local, passagem_aerea: @despacho.passagem_aerea, processo: @despacho.processo, servidor_id: @despacho.servidor_id }
    assert_redirected_to despacho_path(assigns(:despacho))
  end

  test "should destroy despacho" do
    assert_difference('Despacho.count', -1) do
      delete :destroy, id: @despacho
    end

    assert_redirected_to despachos_path
  end
end
