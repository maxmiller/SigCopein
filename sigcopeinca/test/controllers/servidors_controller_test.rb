require 'test_helper'

class ServidorsControllerTest < ActionController::TestCase
  setup do
    @servidor = servidors(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:servidors)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create servidor" do
    assert_difference('Servidor.count') do
      post :create, servidor: { cpf: @servidor.cpf, email: @servidor.email, habilitado: @servidor.habilitado, lattes: @servidor.lattes, nome: @servidor.nome, siape: @servidor.siape }
    end

    assert_redirected_to servidor_path(assigns(:servidor))
  end

  test "should show servidor" do
    get :show, id: @servidor
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @servidor
    assert_response :success
  end

  test "should update servidor" do
    patch :update, id: @servidor, servidor: { cpf: @servidor.cpf, email: @servidor.email, habilitado: @servidor.habilitado, lattes: @servidor.lattes, nome: @servidor.nome, siape: @servidor.siape }
    assert_redirected_to servidor_path(assigns(:servidor))
  end

  test "should destroy servidor" do
    assert_difference('Servidor.count', -1) do
      delete :destroy, id: @servidor
    end

    assert_redirected_to servidors_path
  end
end
